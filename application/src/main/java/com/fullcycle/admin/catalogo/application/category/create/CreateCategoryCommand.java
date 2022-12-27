package com.fullcycle.admin.catalogo.application.category.create;

public record CreateCategoryCommand(
        String name,
        String description,
        Boolean isActive
) {
    public static CreateCategoryCommand with(String aName, String aDescription, Boolean isActive) {
        return new CreateCategoryCommand(aName, aDescription, isActive);
    }
}
