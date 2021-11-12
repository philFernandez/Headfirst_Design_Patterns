class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setState(12);
        System.out.println(singleton.getState());
        Singleton fred = Singleton.getInstance();
        System.out.println(fred.getState());
        fred.setState(2);
        System.out.println(singleton.getState());
        System.out.println(fred);
        System.out.println(singleton);
    }
}