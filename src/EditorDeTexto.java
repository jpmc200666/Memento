public class EditorDeTexto {
    private String texto;

    public void setText(String texto){
        this.texto = texto;
    }

    public String getTexto(){
        return texto;
    }

    public EditorDeTextoMemento guardar(){
        return new EditorDeTextoMemento(texto);
    }

    public void restaurar(EditorDeTextoMemento memento){
        this.texto = memento.getTexto();
    }
}