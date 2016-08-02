package com.javarush.test.level23.lesson06.task02;

/* Рефакторинг
Отрефакторите класс Solution: вынесите все константы в public вложенный(nested) класс Constants.
Запретите наследоваться от Constants.
*/
public class Solution {
    public static final class Constants {
        public static final String AAA =  "Server is not accessible for now.";
        public static final String BBB =  "User is not authorized.";
        public static final String CCC =  "User is banned.";
        public static final String DDD =  "Access is denied.";
    }

    public class ServerNotAccessibleException extends Exception {
        public ServerNotAccessibleException() {
            super(Constants.AAA);
        }

        public ServerNotAccessibleException(Throwable cause) {
            super(Constants.AAA, cause);
        }
    }

    public class UnauthorizedUserException extends Exception {
        public UnauthorizedUserException() {
            super(Constants.BBB);
        }

        public UnauthorizedUserException(Throwable cause) {
            super(Constants.BBB, cause);
        }
    }

    public class BannedUserException extends Exception {
        public BannedUserException() {
            super(Constants.CCC);
        }

        public BannedUserException(Throwable cause) {
            super(Constants.CCC, cause);
        }
    }

    public class RestrictionException extends Exception {
        public RestrictionException() {
            super(Constants.DDD);
        }

        public RestrictionException(Throwable cause) {
            super(Constants.DDD, cause);
        }
    }
}
