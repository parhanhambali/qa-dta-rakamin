@All
Feature: Login ke halaman website

  @Regression
  Scenario: User melakukan login berhasil
    Given User akses ke halaman web
    When User input username yang valid
    And User input password yang valid
    And User klik tombol button login
    Then User masuk ke halaman web

  Scenario: User gagal melakukan login
    Given User akses ke halaman web
    When User input username yang invalid
    And User input password yang invalid
    And User klik button login
    Then Website menampilkan pesan error