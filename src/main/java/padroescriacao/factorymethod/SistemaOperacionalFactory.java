package padroescriacao.factorymethod;

public class SistemaOperacionalFactory {
    public static ISistemaOperacional realizarDownload( String tipoSistema){
        Class classe;
        Object objeto;

        try{
            classe = Class.forName("factorymethod" + tipoSistema);
            objeto = classe.newInstance();
        }catch(Exception ex){
            throw new IllegalArgumentException("Arquivo de download inexistente.");
        }
        if(!(objeto instanceof  ISistemaOperacional)){
            throw new IllegalArgumentException("Arquivo de download inválido.");
        }
        return ( ISistemaOperacional ) objeto;
    }
}
