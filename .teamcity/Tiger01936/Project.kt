package Tiger01936

import Tiger01936.buildTypes.*
import Tiger01936.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01936")
    name = "Tiger01936"

    vcsRoot(Tiger01936_cVCSroot)

    buildType(Tiger01936_Hi2)
    buildType(Tiger01936_Hi3)
    buildType(Tiger01936_Hi0)
    buildType(Tiger01936_Hi1)
})
