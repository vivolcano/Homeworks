package homework19;

public class Main {
    public static void main(String[] args) {
        UsersRepository usersRepository =
                new UsersRepositoryFileImpl("/Users/admin/Desktop/Homeworks/src/main/resources/homework19_users.txt");

        usersRepository.findByAge(64).stream().forEach(System.out::println);
        usersRepository.findByIsWorkerIsTrue().stream().forEach(System.out::println);

    }
}
