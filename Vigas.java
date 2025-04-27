public class Vigas{
    double base;
    double altura;
    double comprimento;
    double volumeConcreto;
    
    //set()
    
    public void setBase(double _base){
        this.base = _base;
    }
    
     public void setAltura(double _altura){
        this.altura = _altura;
    }
    
     public void setComprimento(double _comprimento){
        this.comprimento = _comprimento;
    }
    
    // get()
    
    public double getBase(){
        return base;
    }
    
     public double getAltura(){
        return altura;
    }
    
     public double getComprimento(){
        return comprimento;
    }
    
     public double getVolumeConcreto(){
        return volumeConcreto;
    }
    
    public void CalculoVolumeConcreto(){
        volumeConcreto = base * altura * comprimento;
    }
    
    public void Mensagem(){
        System.out.println("Para a construção, são necessários " + volumeConcreto + " m³ de concreto ");
    }
    
}