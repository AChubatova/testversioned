package Tiger01436

import Tiger01436.buildTypes.*
import Tiger01436.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01436")
    name = "Tiger01436"

    vcsRoot(Tiger01436_cVCSroot)

    buildType(Tiger01436_Hi3)
    buildType(Tiger01436_Hi2)
    buildType(Tiger01436_Hi1)
    buildType(Tiger01436_Hi0)
})
