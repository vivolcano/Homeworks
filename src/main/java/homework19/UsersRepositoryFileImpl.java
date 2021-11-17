package homework19;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryFileImpl implements UsersRepository {

    private String fileName;

    public UsersRepositoryFileImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        // объявили переменные для доступа
        Reader reader = null;
        BufferedReader bufferedReader = null;
        try {
            // создали читалку на основе файла
            reader = new FileReader(fileName);
            // создали буферизированную читалку
            bufferedReader = new BufferedReader(reader);
            // прочитали строку
            String line = bufferedReader.readLine();
            // пока к нам не пришла "нулевая строка"
            while (line != null) {
                // разбиваем ее по |
                String[] parts = line.split("\\|");
                // берем имя
                String name = parts[0];
                // берем возраст
                int age = Integer.parseInt(parts[1]);
                // берем статус о работе
                boolean isWorker = Boolean.parseBoolean(parts[2]);
                // создаем нового человека
                User newUser = new User(name, age, isWorker);
                // добавляем его в список
                users.add(newUser);
                // считываем новую строку
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        } finally {
            // этот блок выполнится точно
            if (reader != null) {
                try {
                    // пытаемся закрыть ресурсы
                    reader.close();
                } catch (IOException ignore) {}
            }
            if (bufferedReader != null) {
                try {
                    // пытаемся закрыть ресурсы
                    bufferedReader.close();
                } catch (IOException ignore) {}
            }
        }
        return users;
    }

    @Override
    public void save(User user) {
        Writer writer = null;
        BufferedWriter bufferedWriter = null;
        try {
            writer = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write(user.getName() + "|" + user.getAge() + "|" + user.isWorker());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ignore) {}
            }
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException ignore) {}
            }
        }
    }

    @Override
    public List<User> findByAge(int age) {
        List<User> users = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String str;

            while ((str = br.readLine()) != null) {
                String[] parts = str.split("\\|");

                String name = parts[0];
                int yearsOld = Integer.parseInt(parts[1]);
                boolean isWorker = Boolean.parseBoolean(parts[2]);

                if (yearsOld == age) {
                    users.add(new User(name, yearsOld, isWorker));
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return users;
    }

    @Override
    public List<User> findByIsWorkerIsTrue() {
        List<User> users = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String str;

            while ((str = br.readLine()) != null) {
                String[] parts = str.split("\\|");

                String name = parts[0];
                int yearsOld = Integer.parseInt(parts[1]);
                boolean isWorker = Boolean.parseBoolean(parts[2]);

                if (isWorker) {
                    users.add(new User(name, yearsOld, isWorker));
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return users;
    }
}
