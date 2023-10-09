package practice;

public class studnet {
//    public studnet(){
//
//    }

    private String pen;
    private String notebook;

    public studnet pen(String pen){
        this.pen = pen;
        return this;
    }
    public studnet notebook(String notebook){
        this.notebook = notebook;
        return this;
    }

    public String toString(){
        return this.pen+" "+this.notebook;
    }

}
