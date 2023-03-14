package homeworks.profileWork.chapter02.task04;
/**
 * В некоторой организации хранятся документы (см. класс Document).
 * Сейчас все документы лежат в ArrayList, из-за чего поиск по id документа выполняется неэффективно.
 * Для оптимизации поиска по id, необходимо помочь сотрудникам перевести хранение документов из ArrayList в HashMap.
 * <p>
 * public class Document {
 * public int id;
 * public String name;
 * public int pageCount;
 * }
 * Реализовать метод со следующей сигнатурой:
 * public Map<Integer, Document> organizeDocuments(List<Document> documents)
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Document {
    public int id;
    public String name;
    public int pageCount;


    public Map<Integer, Document> organizeDocuments(List<Document> documents) {
        Map<Integer, Document> result = new HashMap<>();
        for (Document item : documents) {
            result.put(item.id, item);
        }
        return result;
    }

}
