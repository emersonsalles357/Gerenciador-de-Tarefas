import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerenciador{
    public static <Tarefa> void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Tarefas> listaTarefas = new ArrayList<>();
        int contadorId = 1;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("/n--- GERENCIADOR DE TAREFAS ---");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Concluir Tarefa");
            System.out.println("4. Excluir Tarefa");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o título da tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite a descrição: ");
                    String descricao = scanner.nextLine();

                    Tarefas novaTarefa = new Tarefas(contadorId, titulo, descricao);
                    listaTarefas.add((Tarefas) novaTarefa);
                    contadorId++;
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- MINHAS TAREFAS ---");
                    if (listaTarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    }else {
                        for (Tarefas t : listaTarefas) {
                            System.out.println(t);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite o ID da tarefa que deseja concluir: ");
                    int idConcluir = scanner.nextInt();
                    boolean achouConcluir = false;

                    for (Tarefas t : listaTarefas) {
                        if (t.getId() == idConcluir) {
                            t.setConcluida(true);
                            achouConcluir = true;
                            System.out.println("Tarefa '" + t.getTitulo() + "' marcada como concluída!");
                            break;

                        }
                    }
                    if (!achouConcluir) {
                        System.out.println("Tarefa com o id informado não encontrada. ");
                    }
                    break;

                case 4:
                    System.out.println("Digite o ID da tarefa que deseja excluir: ");
                    int idExcluir = scanner.nextInt();
                    boolean achouExcluir = false;

                    for (int i = 0; i < listaTarefas.size(); i++) {
                        if (listaTarefas.get(i).getId() == idExcluir) {
                            System.out.println("Tarefa '" + listaTarefas.get(i).getTitulo() + "' removida.");
                            listaTarefas.remove(i);
                            achouExcluir = true;
                            break;

                        }
                    }
                    if (!achouExcluir) {
                        System.out.println("Tarefa com o ID informado não encontrada. ");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente. ");

            }
        }
        scanner.close();

    }
}