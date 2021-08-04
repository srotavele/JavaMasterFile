class ProjectTest {
    public static void main(String[] args) {
        Project pTest = new Project();
        System.out.println(pTest.elevatorPitch());
        pTest.elevatorPitch();
        pTest.setName("Box");
        pTest.setDescription("Fold and tape");
        String testName = pTest.getName();
        String testDesc = pTest.getDescription();
        System.out.println("Project Name: " + testName + ", Description: " + testDesc);
        Project pTest1 = new Project("Incorrect Haiku", " Has 16 syllables");
        System.out.println("Project Name: " + pTest1.getName() + " , Description: " + pTest1.getDescription());
        Project pTest2 = new Project("Dumb ideas", " Dollar beer and free bat day at the ballgame");
        System.out.println("Project Name: " + pTest2.getName() + " , Description: " + pTest2.getDescription());
    }
}

