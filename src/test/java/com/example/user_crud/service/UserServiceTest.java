//package com.example.user_crud.service;
//
//import com.example.user_crud.model.User;
//import com.example.user_crud.repository.UserRepository;
//import org.junit.jupiter.api.*;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.*;
//import org.mockito.junit.jupiter.MockitoExtension;
//import java.util.*;
//import static org.assertj.core.api.Assertions.*;
//import static org.mockito.Mockito.*;
//@ExtendWith(MockitoExtension.class)
//@DisplayName("Tests unitaires de UserService")
//class UserServiceTest {
//    @Mock
//    private UserRepository userRepository;
//    @InjectMocks
//    private UserService userService;
//    private User user;
//
//    @BeforeEach
//    void setUp() {
//        user = new User(1L, "Ahmed", "ahmed@email.com", "aa", "ggg");
//    }
//    @Test
//    @DisplayName("Créer un utilisateur avec succès")
//    void createUser_success() {
//        // Arrange
//        when(userRepository.existsByEmail(user.getEmail())).thenReturn(false);
//        when(userRepository.save(user)).thenReturn(user);
//
//        // Act
//        User result = userService.createUser(user);
//
//        // Assert
//        assertThat(result).isNotNull();
//        assertThat(result.getEmail()).isEqualTo("ahmed@email.com");
//        verify(userRepository).save(user);
//    }
//}