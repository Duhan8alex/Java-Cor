

public class HomeWork {
    public static void main(String[] args) {
        Team dreamTeam = new Team("Dreamteam",
                new TeamMember("Alex", 7),
                new TeamMember("Betani", 5),
                new TeamMember("Klarisa", 6),
                new TeamMember("Den" ,8));

        Course course = new Course(new Cross(5), new Swimming(6), new Fight(7));
        course.doIt(dreamTeam);

    }
}
