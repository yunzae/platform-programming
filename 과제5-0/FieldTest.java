package uk.epl.game;
import uk.epl.player.*;

import uk.epl.player.Midfielder;

import java.util.Objects;
import java.util.Scanner;

enum Command{ADD,UP,START,INFO,STOP,QUIT,INVALID};
public class FieldTest {
    private static Field field = new Field();
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        while (true){
            final Command cmd = getCommand(scanner);
            if(Command.QUIT.equals(cmd)){
                System.out.println("Bye");break;
            }
            if(Command.INVALID.equals(cmd)){
                System.out.println("Invalid Operation!");continue;
            }
            switch (cmd){
                case ADD:
                    final uk.epl.player.Player newPlayer = createPlayer(scanner);
                    System.out.println(newPlayer);
                    field.add(newPlayer);break;
                case UP:field.moveUp(choosePlayer(scanner));break;
                case START: field.start();field.info();break;
                case STOP:field.stop();break;
                case INFO: field.info();break;
                default:break;
            }

        }
        scanner.close();
    }
    private static Command getCommand(final Scanner scanner){
        System.out.print("Enter Command String! ");
        final String operation = scanner.next();

        Command kind;
        try {
            kind=Command.valueOf(operation.toUpperCase());
        }catch (IllegalArgumentException e){
            kind = Command.INVALID;
        }
        return kind;
    }
    private static int choosePlayer(Scanner scanner){
        final int jerseyNumber = scanner.nextInt();
        return jerseyNumber;
    }
    private static uk.epl.player.Player createPlayer(final Scanner scanner){
        final String position = scanner.next();
        final String name = scanner.next();
        final int jerseyNumber = scanner.nextInt();
        final int speed = scanner.nextInt();
        final int stamina = scanner.nextInt();
        final int passing = scanner.nextInt();

        uk.epl.player.Player newPlayer = null;
        if("F".equals(position)){
            newPlayer = new Forward(name,jerseyNumber,speed,stamina,passing);
        } else if ("M".equals(position)) {
            newPlayer = new Midfielder(name,jerseyNumber,speed,stamina,passing);
        } else if (Objects.equals("D", position)) {
            newPlayer = new Defender(name,jerseyNumber,speed,stamina,passing);
        }
        return newPlayer;
    }
}
