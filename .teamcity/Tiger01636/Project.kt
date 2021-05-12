package Tiger01636

import Tiger01636.buildTypes.*
import Tiger01636.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01636")
    name = "Tiger01636"

    vcsRoot(Tiger01636_cVCSroot)

    buildType(Tiger01636_Hi3)
    buildType(Tiger01636_Hi2)
    buildType(Tiger01636_Hi1)
    buildType(Tiger01636_Hi0)
})
