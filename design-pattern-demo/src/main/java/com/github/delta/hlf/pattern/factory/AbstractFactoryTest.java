package com.github.delta.hlf.pattern.factory;

/**
 * 提供一个创建一系列相关或互相依赖对象的接口，而无需指定它们具体的类。
 *
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        IDatabaseUtils iDatabaseUtils = new OracleDatabaseUtils();
        IConnection connection = iDatabaseUtils.getConnection();
        connection.connect();
        ICommand command = iDatabaseUtils.getCommand();
        command.command();
    }
}

interface IConnection {

    void connect();

}

interface ICommand {

    void command();
}

interface IDatabaseUtils {

    IConnection getConnection();

    ICommand getCommand();
}
class MysqlConnection implements IConnection{

    @Override
    public void connect() {
        System.out.println("mysql connected.");
    }
}
class MysqlCommand implements ICommand{

    @Override
    public void command() {
        System.out.println("mysql command.");
    }
}
class MysqlDatabaseUtils implements IDatabaseUtils{

    @Override
    public IConnection getConnection() {
        return new MysqlConnection();
    }

    @Override
    public ICommand getCommand() {
        return new MysqlCommand();
    }
}


class OracleConnection implements IConnection{

    @Override
    public void connect() {
        System.out.println("oracle connected.");
    }
}
class OracleCommand implements ICommand{

    @Override
    public void command() {
        System.out.println("oracle command.");
    }
}
class OracleDatabaseUtils implements IDatabaseUtils{

    @Override
    public IConnection getConnection() {
        return new OracleConnection();
    }

    @Override
    public ICommand getCommand() {
        return new OracleCommand();
    }
}