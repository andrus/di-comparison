package org.objectstyle.bootique;

import io.bootique.cli.Cli;
import io.bootique.command.Command;
import io.bootique.command.CommandOutcome;
import org.objectstyle.di.service.Service;

import javax.inject.Inject;
import javax.inject.Provider;

public class MainCommand implements Command {

    private Provider<Service> serviceProvider;

    @Inject
    public MainCommand(Provider<Service> serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    @Override
    public CommandOutcome run(Cli cli) {
        System.out.println(serviceProvider.get().doIt());
        //        Meter.runMetrics();
        return CommandOutcome.succeeded();
    }
}
