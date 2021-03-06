package win.doyto.query.module.user;

import lombok.Getter;
import lombok.Setter;
import win.doyto.query.entity.EntityResponse;

/**
 * UserResponse
 *
 * @author f0rb
 */
@Getter
@Setter
public class UserResponse implements EntityResponse<UserEntity, UserResponse> {
    private static final long serialVersionUID = -1L;

    private Long id;
    private String username;
    private String mobile;
    private String email;
    private String nickname;
    private Boolean valid;
    private UserLevel userLevel;

}
