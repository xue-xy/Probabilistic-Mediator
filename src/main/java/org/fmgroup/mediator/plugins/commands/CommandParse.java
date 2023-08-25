package org.fmgroup.mediator.plugins.commands;

import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.MutuallyExclusiveGroup;
import net.sourceforge.argparse4j.inf.Namespace;
import org.fmgroup.mediator.language.Program;
import org.fmgroup.mediator.plugin.command.Command;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Map;
import java.util.List;
import org.fmgroup.mediator.language.entity.Entity;
import org.fmgroup.mediator.language.entity.automaton.Automaton;
import org.fmgroup.mediator.language.entity.automaton.Transition;
import org.fmgroup.mediator.language.entity.automaton.TransitionSingle;
import org.fmgroup.mediator.language.function.Function;
import org.fmgroup.mediator.language.scope.DeclarationCollection;
import org.fmgroup.mediator.language.scope.Scope;

public class CommandParse implements Command {
    @Override
    public String getCommandName() {
        return "parse";
    }

    @Override
    public void run(Namespace args) throws FileNotFoundException {
        File model = args.get("FILE");
        if (!model.exists()) {
            System.err.println(String.format("file %s not exists", model.getPath()));
            return;
        }

        Program prog = Program.parseFile(model.getPath());
        if (prog != null) {
            System.out.println(prog.toString());
        }
    }

    @Override
    public boolean isBuiltIn() {
        return true;
    }

    @Override
    public String getName() {
        return "CommandParse";
    }

    @Override
    public String getVersion() {
        return "0.0.1";
    }

    @Override
    public ArgumentParser getParamsParser() {
        ArgumentParser parser = ArgumentParsers.newFor("generate").build()
                .description("simply parse a mediator source file and report errors.");

        parser.addArgument("FILE")
                .type(File.class)
                .required(true)
                .help("file that contains the entity you want to generate");


        MutuallyExclusiveGroup dependency = parser.addMutuallyExclusiveGroup();
        dependency.addArgument("-I", "--include")
                .type(File.class)
                .required(false)
                .nargs("+")
                .help("paths where Mediator will load external libraries");
        dependency.addArgument("-p", "--project")
                .type(File.class)
                .required(false)
                .help("project file where this model belongs");

        return parser;
    }

    @Override
    public String getDescription() {
        return "parse a mediator model and report errors.";
    }
    
    public static void main(String[] args) throws FileNotFoundException{
    	Program prog = Program.parseFile("resources\\models\\abpexpand.txt");
    	System.out.println(prog.toString());
//    	Map<String, Automaton> automatas = prog.getAutomata();
//    	Automaton automata = automatas.get("philosopher");
//    	List<Transition> transitions = automata.getTransitions();
//    	for(Transition tran : transitions) {
//    		tran = (TransitionSingle) tran;
//    		System.out.println(tran.toString());
//    	}
    }
    
}
