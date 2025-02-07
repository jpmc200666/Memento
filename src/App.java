public class App {
    public static void main(String[] args) throws Exception {
            EditorDeTexto editor = new EditorDeTexto();
            HistorialEditorTexto historial = new HistorialEditorTexto();
    
            editor.setText("Hola, mundo!");
            historial.guardar(editor); // Guardar estado
            System.out.println("Texto actual: " + editor.getTexto());
    
            editor.setText("Este es un patrón de diseño.");
            historial.guardar(editor); // Guardar estado
            System.out.println("Texto actual: " + editor.getTexto());
    
            editor.setText("Agregué una nueva línea.");
            System.out.println("Texto actual: " + editor.getTexto());
    
            // Deshacer cambios
            historial.deshacer(editor);
            System.out.println("Después de deshacer: " + editor.getTexto());
    
            historial.deshacer(editor);
            System.out.println("Después de deshacer: " + editor.getTexto());
    
            historial.deshacer(editor); // No hay más estados para deshacer
    }
}
