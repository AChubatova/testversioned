package Tiger01938

import Tiger01938.buildTypes.*
import Tiger01938.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01938")
    name = "Tiger01938"

    vcsRoot(Tiger01938_cVCSroot)

    buildType(Tiger01938_Hi2)
    buildType(Tiger01938_Hi3)
    buildType(Tiger01938_Hi0)
    buildType(Tiger01938_Hi1)
})
