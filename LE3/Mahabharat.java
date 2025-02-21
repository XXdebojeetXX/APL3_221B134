public class Mahabharat {
    public static void main(String[] args) {
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        Bharatvanshi duryodhan = new Duryodhan();
        Bharatvanshi vikarn = new Vikarn();

        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}

abstract class Bharatvanshi {
    
    void fight() {
        System.out.println(this.getClass().getSimpleName() + " is fighting.");
    }

    abstract void obey();
    abstract void kind();
}

class Pandav extends Bharatvanshi {
    @Override
    void obey() {
        System.out.println(this.getClass().getSimpleName() + " is obedient.");
    }

    @Override
    void kind() {
        System.out.println(this.getClass().getSimpleName() + " is kind.");
    }
}

class Kaurav extends Bharatvanshi {
    @Override
    void obey() {
        System.out.println(this.getClass().getSimpleName() + " is disobedient.");
    }

    @Override
    void kind() {
        System.out.println(this.getClass().getSimpleName() + " is cruel.");
    }
}

class Arjun extends Pandav {
    
}

class Bheem extends Pandav {
    @Override
    void kind() {
        System.out.println(this.getClass().getSimpleName() + " is less kind.");
    }
}

class Duryodhan extends Kaurav {
    
}

class Vikarn extends Kaurav {
    @Override
    void obey() {
        System.out.println("Vikarn is obedient.");
    }

    @Override
    void kind() {
        System.out.println("Vikarn is kind.");
    }
}