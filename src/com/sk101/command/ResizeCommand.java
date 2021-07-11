package com.sk101.command;

import com.sk101.command.framework.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize Command");
    }
}
