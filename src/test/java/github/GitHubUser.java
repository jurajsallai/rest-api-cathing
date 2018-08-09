package github;

public class GitHubUser {

    private String login;

    public GitHubUser() {
        super();
    }

    // API -- tento file do zlozky API - podobne som robil pre databazy

    public String getLogin() {
        return login;
    }

    public void setLogin(final String login) {
        this.login = login;
    }

}