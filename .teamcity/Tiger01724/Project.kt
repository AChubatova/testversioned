package Tiger01724

import Tiger01724.buildTypes.*
import Tiger01724.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01724")
    name = "Tiger01724"

    vcsRoot(Tiger01724_cVCSroot)

    buildType(Tiger01724_Hi3)
    buildType(Tiger01724_Hi0)
    buildType(Tiger01724_Hi1)
    buildType(Tiger01724_Hi2)
})
