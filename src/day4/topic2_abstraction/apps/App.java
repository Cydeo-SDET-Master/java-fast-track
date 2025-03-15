package day4.topic2_abstraction.apps;

public abstract class App {
    public abstract void launch();
}

class Discord extends App {
    @Override
    public void launch() {
        System.out.println("Connecting to Discord servers...");
    }
}

class Instagram extends App implements Stories, Photos {
    @Override
    public void launch() {
        System.out.println("Connecting to Instagram servers...");
    }

    @Override
    public void createStory() {
        System.out.println("Creating story on instagram");
    }

    @Override
    public void viewStory() {
        System.out.println("Viewing story");
    }

    @Override
    public void post() {
        System.out.println("Posting photo to Instagram");
    }
}

interface Photos {
    public abstract void post();
}
