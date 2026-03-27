public class Entity {
    protected int posX;
    protected int posY;

    public Entity()
    {
    }

    public Entity(int posX, int posY)
    {
        this.posX = posX;
        this.posY = posY;
    }

    public int GetPosX()
    {
        return posX;
    }

    public int GetPosY()
    {
        return posY;
    }

    public int SetPosX(int posX)
    {
        if(posY > 0)
            this.posX = posX;
    }

    public int SetPosY(int posY)
    {
        if(posY > 0)
            this.posY = posY;
    }
}
