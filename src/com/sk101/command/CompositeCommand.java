package com.sk101.command;

import com.sk101.command.framework.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {

    public List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (var command: commands) {
            command.execute();
        }
    }
}
