package memento.domain;

import lombok.Getter;

@Getter
public class ArticleMemento {

    private final int id;
    private final String title;
    private final String content;

    public ArticleMemento(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

}
