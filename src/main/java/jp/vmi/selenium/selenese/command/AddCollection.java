package jp.vmi.selenium.selenese.command;

import jp.vmi.selenium.selenese.TestCase;

public class AddCollection extends Command {

    private static final int COLLECTION_NAME = 0;

    AddCollection(int index, String name, String[] args, String realName, boolean andWait) {
        super(index, name, args);
    }

    @Override
    public Result doCommand(TestCase testCase) {
        testCase.addCollection(args[COLLECTION_NAME]);
        return SUCCESS;
    }
}
