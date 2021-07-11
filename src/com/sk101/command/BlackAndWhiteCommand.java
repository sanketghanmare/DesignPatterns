package com.sk101.command;

import com.sk101.command.framework.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white command");
    }
}
