package com.farukbozan.projecte.designpatterns.behavioral.memento;

public class GameOriginator {

    private int level;

    private int score;

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

    public void levelUp() {
        level++;
        score = level * 1000;
    }

    public void fail() {
        level = 0;
        score = 0;
    }

    public void restore(GameMemento memento) {
        this.level = memento.level();
        this.score = memento.score();
    }

    public GameMemento save() {
        return new GameMemento(level, score);
    }

}
