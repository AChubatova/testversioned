package Tiger01817

import Tiger01817.buildTypes.*
import Tiger01817.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01817")
    name = "Tiger01817"

    vcsRoot(Tiger01817_cVCSroot)

    buildType(Tiger01817_Hi0)
    buildType(Tiger01817_Hi1)
    buildType(Tiger01817_Hi2)
    buildType(Tiger01817_Hi3)
})
