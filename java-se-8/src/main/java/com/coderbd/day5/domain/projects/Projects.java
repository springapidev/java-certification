package com.coderbd.day5.domain.projects;
/**
 *
 * @author Instructor
 */
public class Projects {
    //id, title, type(Hr, Accounts, Marketing etc), status, language, framework
    
    private int id;
    private String title;
    private Type type;
    private Status status;
    private Language language;
    private Framework framework;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Type getType() {
        return type;
    }

    public Status getStatus() {
        return status;
    }

    public Language getLanguage() {
        return language;
    }

    public Framework getFramework() {
        return framework;
    }

    public Projects(int id, String title, Type type, Status status, Language language, Framework framework) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.status = status;
        this.language = language;
        this.framework = framework;
    }

    public Projects() {
    }
}
