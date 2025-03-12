package com.tisp.accounts.dto;

import lombok.Data;

@Data
//@Data annotation is a convenient shortcut in Java that bundles several other annotations together, including @Getter, @Setter, @ToString, @EqualsAndHashCode, and @RequiredArgsConstructor
public class AccountsDto {

    private Long accountNumber;
    private String accountType;
    private String branchAddress;

}
