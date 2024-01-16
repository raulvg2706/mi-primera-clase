public class Mochila {

    private String color;
    private int pesoMax;
    private boolean abiertaCerrada;


    public Mochila(String color, int pesoMax) {
        this.color = color;
        this.pesoMax = pesoMax;

        this.abiertaCerrada = false;
    }

    public String getColor() {
        return color;
    }

    public int getPesoMax() {
        return pesoMax;
    }

    public boolean isAbierta() {
        return abiertaCerrada;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void modificarPesoMax(int nuevoPeso) {
        this.pesoMax += nuevoPeso;
    }

    public void correrCremallera() {
        abiertaCerrada = !abiertaCerrada;
    }
}