package ru.mirea.task6.ex12;

import java.util.ArrayList;
import java.util.List;

class AppendCommand implements Command {
    private final String textToAppend;

    public AppendCommand(String textToAppend) {
        this.textToAppend = textToAppend;
    }

    @Override
    public void execute(StringBuilder stringBuilder) {
        stringBuilder.append(textToAppend);
    }
}