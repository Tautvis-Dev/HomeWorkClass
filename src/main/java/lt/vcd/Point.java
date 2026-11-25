package lt.vcd;

public class Point {
    private int x;
    private int y;

    /**
     * Konstruktorius kuriam sukurimo metu priskiriamos reikšmes:
     * @param x pradinė horizontalioji reikšmė
     * @param y pradinė vertikalioji reikšmė
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Geteris gražina taško objekto reikšme
     * @return x dabartinę kordinatę
     */
    public int getX() {
        return x;
    }

    /**
     * Seteris pakeičia dabartinę objekto reikšmę
     * @param x keičiama reikšmė
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Geteris gražina taško objekto reikšme
     * @return y dabartinę kordinatę
     */
    public int getY() {
        return y;
    }

    /**
     * Seteris pakeičia dabartinę objekto reikšmę
     * @param y keičiama reikšmė
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Metodas gržina esamų kordinačių atstumą nuo 0, 0 kordinačiu iki esamų
     * @return gražina apskaičiuota atstumą pagal apskaičiuota kvadratines šaknies formulę
     */
    public double distanceFromOrigin() {
    return Math.sqrt((double)(x * x) + (y * y));

    };

    /**
     * Metodas prideda prie esamų kordinačių naujas reikšmes:
     * @param dx parametras prideda prie x ir gaunama nauja kordinatė
     * @param dy parametras prideda prie y ir gaunama nauja kordinatė
     */
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    /**
     * Perrašo Object klasės toString metoda, kad konsolėje galečiau atspausdinti ne objekto adresą, o
     * kordinates
     * @return gražina tekstą formatu [x;y]
     */
    @Override
    public String toString() {
        return "["+x+";"+y+"]";
    }

    /**
     * Metodas apskaičiuoja ir gražina tarp dviejų objektu taškų atstumą
     * @param p perduodam kaip parametrą patį objektą
     * @return gražinam gauta atstumą tarp dviejų taškų
     */
    public double distance(Point p) {
        int dx = p.x - x;
        int dy = p.y - y;
        return Math.sqrt((double)(dx * dx) + (dy * dy));
    }

    /**
     * Metodas atnaujina esamas kordinates
     * @param x pakeičiame horizonataliaje i nauja kordinatę
     * @param y pakeičiame vertikaliaje i nauja kordinatę
     */
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
