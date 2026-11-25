package lt.vcd;

public class Line {
    private Point p1;
    private Point p2;

    /**
     * Line konstruktorius be parametru
     */
    public Line() {};

    /**
     * Line konstruktorius su dviem parametrais Point klases objektais
     * @param p1 pirmas objektas
     * @param p2 antras objektas
     */
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Geteris gražina p1 obejkta
     * @return p1 obejktas
     */
    public Point getP1() {
        return p1;
    }

    /**
     * Pkeičia dabartini objekta p1
     * @param p1 parametras p1 objekto
     */
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    /**
     * Geteris gražina p2 obejkta
     * @return p2 obejktas
     */
    public Point getP2() {
        return p2;
    }

    /**
     * Pkeičia dabartini objekta p2
     * @param p2 parametras p2 objekto
     */
    public void setP2(Point p2) {
        this.p2 = p2;
    }

    /**
     * Perrašo Object klasės toString matotoda
     * @return gražina teksta
     */
    @Override
    public String toString() {
        return "Pradžios taškas: " + getP1() + " pabaigos taškas: " + getP2();
    }


    /**
     * Metodas apskaičiuoja linijos ilgį tarp dviejų taškų return pnaudojame jau Point klases skurta
     * metota distance() , kad galėtume šiame metode apskaičiuoti tarp dviejų taškų linijos ilgi.
     * @return gražina atstumą tarp dviejų taškų.
     */
    public double distanceLine() {
        return p1.distance(p2);
    }
}
