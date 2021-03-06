public class AllFalseEntityVisitor implements EntityVisitor<Boolean> {

    @Override
    public Boolean visit(Blacksmith blacksmith) {
        return false;
    }

    @Override
    public Boolean visit(MinerFull minerFull) {
        return false;
    }

    @Override
    public Boolean visit(MinerNotFull minerNotFull) {
        return false;
    }

    @Override
    public Boolean visit(Obstacle obstacle) {
        return false;
    }

    @Override
    public Boolean visit(Ore ore) {
        return false;
    }

    @Override
    public Boolean visit(OreBlob oreBlob) {
        return false;
    }

    @Override
    public Boolean visit(Quake quake) {
        return false;
    }

    @Override
    public Boolean visit(Vein vein) {
        return false;
    }

    @Override
    public Boolean visit(Portal portal) {
        return false;
    }

    @Override
    public Boolean visit(EnemyHealer enemyHealer) {
        return false;
    }

    @Override
    public Boolean visit(Wyvern wyvern) {
        return false;
    }

    @Override
    public Boolean visit(Ninja ninja) {
        return false;
    }
}
