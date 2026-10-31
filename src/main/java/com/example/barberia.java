public class barberia {

    // 1. Atributos privados
    private String nombreBarberia;
    private String direccion;
    private int puestosTrabajoDisponible;
    private int clientesAtendidosHoy;
    private double precioCorteBasico;
    private double ingresosDia;
    private boolean tieneAireAcondicionado;
    private boolean estaAbierta;
    private String telefonoContacto;
    private char tipoServicio;

    // 2. Constructor por defecto (sin parámetros)
    public Barberia() {
        this.nombreBarberia = "Sin nombre";
        this.direccion = "Sin direccion";
        this.puestosTrabajoDisponible = 1;
        this.clientesAtendidosHoy = 0;
        this.precioCorteBasico = 0.0;
        this.ingresosDia = 0.0;
        this.tieneAireAcondicionado = false;
        this.estaAbierta = false;
        this.telefonoContacto = "0000000000";
        this.tipoServicio = 'C';
    }

    // 2. Constructor parametrizado
    public Barberia(String nombreBarberia, String direccion, int puestosTrabajoDisponible,
                    int clientesAtendidosHoy, double precioCorteBasico, double ingresosDia,
                    boolean tieneAireAcondicionado, boolean estaAbierta,
                    String telefonoContacto, char tipoServicio) {
        setNombreBarberia(nombreBarberia);
        setDireccion(direccion);
        setPuestosTrabajoDisponible(puestosTrabajoDisponible);
        setClientesAtendidosHoy(clientesAtendidosHoy);
        setPrecioCorteBasico(precioCorteBasico);
        setIngresosDia(ingresosDia);
        setTieneAireAcondicionado(tieneAireAcondicionado);
        setEstaAbierta(estaAbierta);
        setTelefonoContacto(telefonoContacto);
        setTipoServicio(tipoServicio);
    }

    // 3. Getters y Setters con validaciones lógicas

    public String getNombreBarberia() {
        return nombreBarberia;
    }

    public void setNombreBarberia(String nombreBarberia) {
        if (nombreBarberia != null && !nombreBarberia.trim().isEmpty()) {
            this.nombreBarberia = nombreBarberia;
        } else {
            System.out.println("Error: El nombre de la barberia no puede estar vacio.");
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion != null && !direccion.trim().isEmpty()) {
            this.direccion = direccion;
        } else {
            System.out.println("Error: La direccion no puede estar vacia.");
        }
    }

    public int getPuestosTrabajoDisponible() {
        return puestosTrabajoDisponible;
    }

    public void setPuestosTrabajoDisponible(int puestosTrabajoDisponible) {
        if (puestosTrabajoDisponible > 0) {
            this.puestosTrabajoDisponible = puestosTrabajoDisponible;
        } else {
            System.out.println("Error: Debe existir al menos un puesto de trabajo disponible.");
        }
    }

    public int getClientesAtendidosHoy() {
        return clientesAtendidosHoy;
    }

    public void setClientesAtendidosHoy(int clientesAtendidosHoy) {
        if (clientesAtendidosHoy >= 0) {
            this.clientesAtendidosHoy = clientesAtendidosHoy;
        } else {
            System.out.println("Error: Los clientes atendidos no pueden ser un numero negativo.");
        }
    }

    public double getPrecioCorteBasico() {
        return precioCorteBasico;
    }

    public void setPrecioCorteBasico(double precioCorteBasico) {
        if (precioCorteBasico >= 0) {
            this.precioCorteBasico = precioCorteBasico;
        } else {
            System.out.println("Error: El precio del corte no puede ser negativo.");
        }
    }

    public double getIngresosDia() {
        return ingresosDia;
    }

    public void setIngresosDia(double ingresosDia) {
        if (ingresosDia >= 0) {
            this.ingresosDia = ingresosDia;
        } else {
            System.out.println("Error: Los ingresos del dia no pueden ser negativos.");
        }
    }

    public boolean getTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public boolean getEstaAbierta() {
        return estaAbierta;
    }

    public void setEstaAbierta(boolean estaAbierta) {
        this.estaAbierta = estaAbierta;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        if (telefonoContacto != null && telefonoContacto.trim().length() >= 7) {
            this.telefonoContacto = telefonoContacto;
        } else {
            System.out.println("Error: El telefono debe contener un numero valido (al menos 7 caracteres).");
        }
    }

    public char getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(char tipoServicio) {
        char tipoMayus = Character.toUpperCase(tipoServicio);
        if (tipoMayus == 'C' || tipoMayus == 'B' || tipoMayus == 'M') {
            this.tipoServicio = tipoMayus;
        } else {
            System.out.println("Error: Tipo de servicio invalido. Debe ser 'C' (Corte), 'B' (Barba) o 'M' (Mixto).");
        }
    }

    // 4. Sobrescritura de toString()
    @Override
    public String toString() {
        return "Barberia{" +
                "nombreBarberia='" + nombreBarberia + '\'' +
                ", direccion='" + direccion + '\'' +
                ", puestosTrabajoDisponible=" + puestosTrabajoDisponible +
                ", clientesAtendidosHoy=" + clientesAtendidosHoy +
                ", precioCorteBasico=" + precioCorteBasico +
                ", ingresosDia=" + ingresosDia +
                ", tieneAireAcondicionado=" + tieneAireAcondicionado +
                ", estaAbierta=" + estaAbierta +
                ", telefonoContacto='" + telefonoContacto + '\'' +
                ", tipoServicio=" + tipoServicio +
                '}';
    }
}