@All
Feature: Login ke halaman website

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


  Scenario: User akses halaman about
    Given User akses ke halaman web
    When User input username yang valid
    And User input password yang valid
    And User klik button login
    And User klik hamburger menu
    And User klik button about
    Then User masuk ke halaman about


  Scenario: User melakukan checkout
    Given User akses ke halaman web
    When User input username yang valid
    And User input password yang valid
    And User klik button login
    And User klik button add to cart
    And User klik icon keranjang
    And User klik button checkout
    And User input first name
    And User input last name
    And User input postal code
    And User klik button continue
    And User klik button finish
    And User klik button back home
    Then User kembali ke halaman web


  Scenario: User logout dari halaman web
    Given User akses ke halaman web
    When User input username yang valid
    And User input password yang valid
    And User klik tombol button login
    And User klik hamburger menu
    And User klik button logout
    Then User kembali ke halaman web