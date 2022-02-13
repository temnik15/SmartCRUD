package Diplom.Smart.Dubinin.SmartCRUD.Controller;

public enum Tables {
    Права_Доступа(new String[]{"id_прав_доступа", "права_доступа", "false", "false"}),
    Пользователи_эдо(new String[]{"id_пользователя_эдо", "имя_эдо", "токен_пользователя", "false", "false"}),
    Классы_Логирования(new String[]{"id_класса", "класс_логирования", "false", "false"}),
    Роли(new String[]{"id_роли", "роль", "false", "false"}),
    Смарт_контракты(new String[]{"id_контракта", "имя_эдо", "наименование_шаблона", "статус", "ключ_смарт_контракта", "true", "false"}),
    Статусы_Смарт_Контрактов(new String[]{"id_статуса", "статус", "false", "false"}),
    Пользователи(new String[]{"id_пользователя", "Имя", "Роль", "Логин", "Пароль", "true", "true"}),
    Документация(new String[]{"id_документа", "название_документа", "true", "true"}),
    Логи(new String[]{"id_логирования", "класс_логирования", "текст_логирования", "время_логирования", "имя_пользователя", "false", "false"}),
    Отчеты(new String[]{"id_отчета", "имя_пользователя", "название_отчета", "true", "false"}),
    Шаблоны_Смарт_контрактов(new String[]{"id_шаблона", "название_шаблона", "false", "false"}),
    ;


    public String[] tables;

    Tables(String[] strings) {
        this.tables = strings;
    }
}
