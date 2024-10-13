package aulas.POO;

class Main {
    public static void main(String[] args) {
        Planet p = new Planet();
        System.out.println(p.getNome_());
        p.setNome_("Planeta Terra");
        System.out.println(p.getNome_());
    }
}

class Planet {

    private String nome = "Teste";
    public String getNome_(){
        return nome;
    }

    public void setNome_(String nome){
        this.nome = nome;
    }
}
