package espm.account;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Builder @Data @Accessors(fluent = true)
public class AccountOut {
    private String id;
    private String name;
    private String email;
    private String createdAt;
}
