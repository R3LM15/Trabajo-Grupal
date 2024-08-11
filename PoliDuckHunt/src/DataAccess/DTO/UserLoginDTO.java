package DataAccess.DTO;

public class UserLoginDTO {
    private Integer RowNum        ;
    private Integer idUserLogin   ;           
    private Integer idNivel       ;           
    private String nombre         ;           
    private String puntaje        ;          
    private String tiempo         ;           
    private String estado         ;           
    private String fechaCreacion  ;            
    private String fechaModifica  ;
    
    public UserLoginDTO(Integer rowNum, Integer idUserLogin, Integer idNivel, String nombre, String puntaje,
    String tiempo, String estado, String fechaCreacion, String fechaModifica) {
        this.RowNum = rowNum;
        this.idUserLogin = idUserLogin;
        this.idNivel = idNivel;
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.tiempo = tiempo;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.fechaModifica = fechaModifica;
    }

    public UserLoginDTO() {}
    

    public UserLoginDTO(String nombre) {
        this.nombre = nombre;
    }

    public Integer getRowNum() {
        return RowNum;
    }

    public void setRowNum(Integer rowNum) {
        this.RowNum = rowNum;
    }

    public Integer getIdUserLogin() {
        return idUserLogin;
    }

    public void setIdUserLogin(Integer idUserLogic) {
        this.idUserLogin = idUserLogic;
    }

    public Integer getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(Integer idNivel) {
        this.idNivel = idNivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaModifica() {
        return fechaModifica;
    }

    public void setFechaModifica(String fechaModifica) {
        this.fechaModifica = fechaModifica;
    }
    
    @Override
    public String toString(){
        return  getClass().getName()
                + "\n idUserLogin    "+ getIdUserLogin()
                + "\n idNivel        "+ getIdNivel()
                + "\n nombre         "+ getNombre()
                + "\n puntaje        "+ getPuntaje()
                + "\n tiempo         "+ getTiempo()
                + "\n estado         "+ getEstado()
                + "\n fechaCreacion  "+ getFechaCreacion()
                + "\n fechaModifica  "+ getFechaModifica();
    }
}
