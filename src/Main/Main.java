package Main;

import Model.*;
import Service.buscas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //abrindo o scanner
        Scanner scanner = new Scanner(System.in);
        //Chamando a classe random para criar ids
        Random random = new Random();
        //Listas para adicionar objetos e manter armazenados na memoria
        ArrayList<Medico> medicos = new ArrayList<>();
        ArrayList<Repositor> repositores = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Laboratorio> laboratorios = new ArrayList<>();
        ArrayList<Amostra> amostras = new ArrayList<>();
        //criando dois almoxarifados distintos para serem usados nos teste do repositor
        int idAlmoxarifado1 = random.nextInt(1000) + 1;
        int idAlmoxarifado2 = random.nextInt(1000) + 1;
        Almoxarifado almoxarifado1 = new Almoxarifado(idAlmoxarifado1, 60, "Amostras Laboratoriais", "Amostras", repositores);
        Almoxarifado almoxarifado2 = new Almoxarifado(idAlmoxarifado2, 100, "Produtos Químicos", "Químicos", repositores);
        //Criando os laboratorios pelo mesmo motivo do almoxarifado, não acho que faça sentido permitir o usuario a cadastralos
        int idLab1 = random.nextInt(1000) + 1;
        int idLab2 = random.nextInt(1000) + 1;
        int idLab3 = random.nextInt(1000) + 1;
        Laboratorio lab1 = new Laboratorio(idLab1, "12345678", 50, "Analise Sangue", almoxarifado1);
        Laboratorio lab2 = new Laboratorio(idLab2, "87654321", 100, "Analise Urina", almoxarifado2);
        Laboratorio lab3 = new Laboratorio(idLab3, "12345942", 100, "Analise Fezes", almoxarifado2);
        laboratorios.add(lab1);
        laboratorios.add(lab2);
        System.out.println("Bem-Vindo ao StockEasy!");
        //sistema de menu basico, onde o usuario escolhe a opção do menu
        while(true){
            System.out.println("Escolha uma opção");
            int menu = 0;
            System.out.println("1 - Médico \n2 - Repositor \n3 - Produto\n4 - Sair");
            menu = scanner.nextInt();
            scanner.nextLine();
            if (menu == 1){
                menu = 0;
                System.out.println("1 - Cadastrar novo médico\n2 - Exibir informações \n3 - Atualizar e-mail\n4 - Solicitar exame\n5 - emitir diagnostico");
                menu = scanner.nextInt();
                scanner.nextLine();
                if (menu == 1){
                    int idMedico = random.nextInt(1000) + 1; // gerando ID entre 1 e 1000
                    System.out.println("Digite o nome do médico:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a idade do médico:");
                    String idade = scanner.nextLine();
                    System.out.println("Digite o email corporativo do médico:");
                    String emailCorporativo = scanner.nextLine();
                    System.out.println("Digite o CRM do médico:");
                    String crm = scanner.nextLine();
                    System.out.println("Digite a especialidade do médico:");
                    String especialidade = scanner.nextLine();
                    Medico medico = new Medico(nome, idade, emailCorporativo, idMedico, crm, especialidade);
                    //adicionando novo medico a lista
                    medicos.add(medico);
                } else if(menu == 2){
                    System.out.println("Medicos cadastrados");
                    medicos.forEach(medico -> System.out.println(medico.getNome()));
                    System.out.println("Digite o nome do médico:");
                    String nome = scanner.nextLine();
                    Medico medico = buscas.buscarMedicoPorNome(medicos, nome);
                    if (medico != null) {
                        medico.exibirInformacoes();
                    } else {
                        System.out.println("Médico não encontrado.");
                    }
                } else if (menu == 3){
                    System.out.println("Digite o nome do médico que deseja atualizar o email:");
                    String nomeBusca = scanner.nextLine();
                    Medico medico = buscas.buscarMedicoPorNome(medicos, nomeBusca);
                    if (medico != null) {
                        System.out.println("Digite o novo email corporativo:");
                        String novoEmail = scanner.nextLine();
                        medico.atualizarEmail(novoEmail);
                        System.out.println("Email atualizado com sucesso.");
                    } else {
                        System.out.println("Médico não encontrado.");
                    }
                } else if(menu == 4){
                    int idAmostra = random.nextInt(1000) + 1;
                    Laboratorio lab = null;
                    String tipoAmostra = null;
                    while (lab == null) {
                        System.out.println("Digite o tipo de amostra (Sangue, Urina ou Fezes): ");
                        tipoAmostra = scanner.nextLine();
                        if (tipoAmostra.equalsIgnoreCase("Sangue")){
                            lab = lab1;
                            break;
                        } else if (tipoAmostra.equalsIgnoreCase("Urina")) {
                            lab = lab2;
                            break;
                        } else if (tipoAmostra.equalsIgnoreCase("Fezes")) {
                            lab = lab3;
                            break;
                        } else {
                            System.out.println("Tipo de amostra digitado inválido");
                        }
                        String amostra = tipoAmostra;
                    }
                    Date dataColeta = null;
                    while (dataColeta == null) {
                        System.out.println("Digite a data de coleta (formato dd/MM/yyyy):");
                        String dataColetaStr = scanner.nextLine();
                        //try-catch para evitar ParseException
                        try {
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                            sdf.setLenient(false); // impede datas inválidas
                            dataColeta = sdf.parse(dataColetaStr);
                        } catch (ParseException e) {
                            System.out.println("Data inválida. Tente novamente.");
                        }
                    }
                    String nivelPrioridade = null;
                    while (nivelPrioridade == null) {
                        System.out.println("Digite o nível de prioridade (baixo, medio ou alto):");
                        nivelPrioridade = scanner.nextLine();
                        if (nivelPrioridade.equalsIgnoreCase("baixo")){
                            nivelPrioridade = "baixo";
                            break;
                        } else if(nivelPrioridade.equalsIgnoreCase("medio")){
                            nivelPrioridade = "medio";
                            break;
                        } else if (nivelPrioridade.equalsIgnoreCase("alto")) {
                            nivelPrioridade = "alto";
                            break;
                        } else {
                            System.out.println("Nivel de prioriedade digitado inválido");
                            nivelPrioridade = null;
                        }
                    }
                    System.out.println("Médicos disponíveis em nosso sistema: ");
                    medicos.forEach(medico -> System.out.println(medico.getNome()));
                    System.out.println("Digite o nome do médico responsável: ");
                    String nomeMedico = scanner.nextLine();
                    Medico medico = buscas.buscarMedicoPorNome(medicos, nomeMedico);
                    //criando a amostra e adicionando ela a lista de amostras
                    Amostra amostra = new Amostra(idAmostra, tipoAmostra, dataColeta, nivelPrioridade, lab, medico);
                    amostras.add(amostra);
                    //try-catch para evitar null pointer exception (apesar de a IDE continuar reclamando)
                    try {
                        medico.solicitarExame(amostra);
                    } catch (NullPointerException e) {
                        System.out.println("Erro: Médico não encontrado ou amostra não informada.");
                    }
                } else if (menu == 5){
                    while (true) {
                        System.out.println("Digite o tipo de amostra desejado para emitir o diagnostico (Sangue, Fezes ou Urina): ");
                        String tipoAmostra = scanner.nextLine();
                        if (tipoAmostra.equalsIgnoreCase("Sangue") || tipoAmostra.equalsIgnoreCase("Urina") || tipoAmostra.equalsIgnoreCase("Fezes")){
                            Amostra amostra = buscas.buscaAmostraPorTipo(amostras, tipoAmostra);
                            System.out.println("Digite o nome do medico responsavel");
                            String nomeMedico = scanner.nextLine();
                            Medico medico = buscas.buscarMedicoPorNome(medicos, nomeMedico);
                            //outro try-catch para evitar null pointer
                            try {
                                medico.emitirDiagnostico(amostra);
                            } catch (NullPointerException e) {
                                System.out.println("Erro: Médico não encontrado ou amostra não informada.");
                            }
                            break;
                        } else {
                            System.out.println("Tipo invalido digitado");
                        }
                    }
                }
            } else if(menu == 2){
                menu = 0;
                System.out.println("1 - Cadastrar novo Repositor\n2 - Exibir informações\n3 - Consultar estoque\n4 - Repor produto");
                menu = scanner.nextInt();
                scanner.nextLine();
                if (menu == 1){
                    int idRepositor = random.nextInt(1000) + 1;
                    System.out.println("Digite o nome do repositor:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a idade do repositor:");
                    String idade = scanner.nextLine();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.println("Digite o email corporativo do repositor:");
                    String emailCorporativo = scanner.nextLine();

                    Repositor repositor = new Repositor(nome, idade, emailCorporativo, idRepositor);
                    repositores.add(repositor);
                    System.out.println("Repositor cadastrado com sucesso!");
                } else if(menu == 2){
                    System.out.println("Repositores cadatrados:");
                    repositores.forEach(repositor -> repositor.getNome());
                    System.out.println("Digite o nome do repositor que deseja exibir as informações:");
                    String nomeBusca = scanner.nextLine();
                    Repositor repositorEncontrado = buscas.buscarRepositorPorNome(repositores, nomeBusca);
                    if (repositorEncontrado != null) {
                        repositorEncontrado.exibirInformacoes();
                    } else {
                        System.out.println("Repositor não encontrado.");
                    }
                } else if (menu == 3){
                    System.out.println("Digite o nome do repositor:");
                    String nomeBusca = scanner.nextLine();
                    Repositor repositorEncontrado = buscas.buscarRepositorPorNome(repositores, nomeBusca);
                    if (repositorEncontrado != null) {
                        System.out.println("Escolha o almoxarifado:");
                        System.out.println("1 - Almoxarifado Lapa");
                        System.out.println("2 - Almoxarifado Vila olimpia");
                        int opcao = scanner.nextInt();
                        scanner.nextLine();
                        Almoxarifado almoxarifadoEscolhido = null;
                        if (opcao == 1) {
                            almoxarifadoEscolhido = almoxarifado1;
                            repositorEncontrado.consultarEstoque(almoxarifadoEscolhido);
                        } else if (opcao == 2) {
                            almoxarifadoEscolhido = almoxarifado2;
                            repositorEncontrado.consultarEstoque(almoxarifadoEscolhido);
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    } else {
                        System.out.println("Repositor não encontrado.");
                    }
                } else if(menu == 4){
                    Repositor repositor = null;
                    while (repositor == null) {
                        System.out.println("Repositores cadastrados: ");
                        repositores.forEach(r -> System.out.println(r.getNome()));
                        System.out.println("Digite o nome do repositor que irá realizar a reposição:");
                        String nomeBusca = scanner.nextLine();
                        repositor = buscas.buscarRepositorPorNome(repositores, nomeBusca);
                        if (repositor == null) {
                            System.out.println("Repositor não encontrado.");
                        }
                    }
                    System.out.println("Escolha o almoxarifado:");
                    System.out.println("1 - Almoxarifado Lapa");
                    System.out.println("2 - Almoxarifado Vila Olimpia");
                    int opcao = scanner.nextInt();
                    scanner.nextLine();
                    Almoxarifado almoxarifadoEscolhido = null;
                    if (opcao == 1) {
                        almoxarifadoEscolhido = almoxarifado1;
                    } else if (opcao == 2) {
                        almoxarifadoEscolhido = almoxarifado2;
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    System.out.println("Produtos cadastrados: ");
                    produtos.forEach(produto -> System.out.println(produto.getNomeProduto()));
                    System.out.print("Digite o nome do produto que deseja repor: ");
                    String nomeProdutoBusca = scanner.nextLine();
                    Produto produtoEncontrado = buscas.buscarProdutoPorNome(produtos, nomeProdutoBusca);
                    if (produtoEncontrado == null) {
                        System.out.println("Produto não encontrado na lista de produtos.");
                        break;
                    }
                    System.out.print("Digite a quantidade que deseja repor: ");
                    int quantidadeReposicao = scanner.nextInt();
                    repositor.reporProduto(almoxarifadoEscolhido, produtoEncontrado, quantidadeReposicao);
                }
            } else if(menu == 3){
                menu = 0;
                System.out.println("1 - Cadastrar novo produto\n2 - Verificar estoque");
                menu = scanner.nextInt();
                scanner.nextLine();
                if (menu == 1){
                    //logica para criação de produto (a ideia é usar o produto criado aqui no metodo reporProduto do repositor)
                    int idProduto = random.nextInt(1000) + 1;
                    System.out.print("Digite o nome do Produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Digite o caso de uso do Produto: ");
                    String casoUso = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite a altura (em cm, por exemplo): ");
                    int altura = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite a largura (em cm, por exemplo): ");
                    int largura = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite a marca do Produto: ");
                    String marca = scanner.nextLine();
                    // Logica para a escolha do almoxarifado
                    System.out.println("Escolha o almoxarifado que este produto pertencera:");
                    System.out.println("1 - Almoxarifado Lapa");
                    System.out.println("2 - Almoxarifado Vila Olimpia");
                    System.out.print("Digite 1 ou 2: ");
                    int opcao = scanner.nextInt();
                    scanner.nextLine();
                    Almoxarifado almoxarifadoEscolhido;
                    while (true){
                        if (opcao == 1) {
                            almoxarifadoEscolhido = almoxarifado1;
                            break;
                        } else if (opcao == 2) {
                            almoxarifadoEscolhido = almoxarifado2;
                            break;
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    }
                    Produto produto = new Produto(idProduto, nomeProduto, casoUso, quantidade, altura, largura, marca, almoxarifadoEscolhido);
                    produtos.add(produto);
                } else if(menu == 2){
                    System.out.println("Digite o nome do produto:");
                    String nomeBusca = scanner.nextLine();
                    Produto produto = buscas.buscarProdutoPorNome(produtos, nomeBusca);
                    if (produto != null) {
                        System.out.print("Digite a quantidade desejada do produto " + produto.getNomeProduto() + ": ");
                        int quantidadeDesejada = scanner.nextInt();
                        produto.verificarEstoque(quantidadeDesejada);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                }
            } else if(menu == 4){
                System.out.println("Obrigado por utilizar!");
                break;
            } else {
                System.out.println("Opção invalida");
            }
        }
        //fechando o scanner
        scanner.close();
    }
}
