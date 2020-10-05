package org.automation.ui.pages.categories;

import org.automation.ui.pages.categories.components.ItemGrid;
import org.automation.ui.pages.common.ShopBasePage;

/**
 * Defines item categories page object model.
 */
public class CategoriesPage extends ShopBasePage {

    private ItemGrid itemGrid;

    /**
     * Initializes an instance of {@link CategoriesPage}.
     */
    public CategoriesPage() {
        itemGrid = new ItemGrid();
    }

    /**
     * Gets item grid component.
     *
     * @return item grid component.
     */
    public ItemGrid getItemGrid() {
        return itemGrid;
    }
}
