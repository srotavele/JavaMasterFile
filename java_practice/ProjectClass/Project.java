class Project {
    // Member Variables
    private String name;
    private String description;


    // Method Overloading
    // Open Project
    public Project() {
        this.name = "Paper plane";
        this.description = " It's made of paper.";
    }
    // Project with Name only
    public Project(String name) {
        this.name = name;
    }
    // Project with Name + Description
    public Project(String name, String description){
        this.name = name;
        this.description = description; 
    }
    // Instance method?
    public String elevatorPitch() {
        return name + " " + description;
        
    }
    // Name SETTER
    public void setName(String newName) {
        name = newName;
    }
    // Name GETTER
    public String getName() {
        return name;
    }
    // Description SETTER
    public void setDescription(String newDescription) {
        description = newDescription;
    }
    // Description GETTER
    public String getDescription() {
        return description;
    }

}

