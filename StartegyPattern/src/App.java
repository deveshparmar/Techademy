public class App {
    public static void main(String[] args) {
        NavigationApp navigationApp = new NavigationApp(new FastestRouteStrategy());

        navigationApp.navigate("Home", "Work");

        // Change strategy dynamically
        navigationApp.setRouteStrategy(new ShortestRouteStrategy());
        navigationApp.navigate("Home", "School");

        navigationApp.setRouteStrategy(new EcoFriendlyRouteStrategy());
        navigationApp.navigate("Park", "Library");
    }
}
